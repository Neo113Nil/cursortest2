package C;

import C.C2704y;
import C.a0;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.c1;
import androidx.concurrent.futures.b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* renamed from: C.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2703x {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f4255m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final SparseArray<Integer> f4256n = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    final androidx.camera.core.impl.L f4257a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4258b;

    /* renamed from: c, reason: collision with root package name */
    private final C2704y f4259c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f4260d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f4261e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.camera.core.impl.G f4262f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.F f4263g;

    /* renamed from: h, reason: collision with root package name */
    private c1 f4264h;

    /* renamed from: i, reason: collision with root package name */
    private final a0 f4265i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<Void> f4266j;

    /* renamed from: k, reason: collision with root package name */
    private a f4267k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.m<Void> f4268l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: C.x$a */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INITIALIZED;
        public static final a INITIALIZING;
        public static final a INITIALIZING_ERROR;
        public static final a SHUTDOWN;
        public static final a UNINITIALIZED;

        static {
            a aVar = new a("UNINITIALIZED", 0);
            UNINITIALIZED = aVar;
            a aVar2 = new a("INITIALIZING", 1);
            INITIALIZING = aVar2;
            a aVar3 = new a("INITIALIZING_ERROR", 2);
            INITIALIZING_ERROR = aVar3;
            a aVar4 = new a("INITIALIZED", 3);
            INITIALIZED = aVar4;
            a aVar5 = new a("SHUTDOWN", 4);
            SHUTDOWN = aVar5;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    C2703x() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2703x(@NonNull Context context) {
        ComponentCallbacks2 componentCallbacks2;
        C2704y.b bVar;
        String string;
        com.google.common.util.concurrent.m<Void> a11;
        H0 h02 = new H0();
        this.f4257a = new androidx.camera.core.impl.L();
        this.f4258b = new Object();
        this.f4267k = a.UNINITIALIZED;
        this.f4268l = I.k.h(null);
        Context a12 = G.f.a(context);
        while (true) {
            if (!(a12 instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (a12 instanceof Application) {
                    componentCallbacks2 = (Application) a12;
                    break;
                }
                a12 = ((ContextWrapper) a12).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof C2704y.b) {
            bVar = (C2704y.b) componentCallbacks2;
        } else {
            try {
                Context a13 = G.f.a(context);
                Bundle bundle = a13.getPackageManager().getServiceInfo(new ComponentName(a13, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException e11) {
                e = e11;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (ClassNotFoundException e12) {
                e = e12;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (IllegalAccessException e13) {
                e = e13;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (InstantiationException e14) {
                e = e14;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (NoSuchMethodException e15) {
                e = e15;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (NullPointerException e16) {
                e = e16;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            } catch (InvocationTargetException e17) {
                e = e17;
                S.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                bVar = null;
                if (bVar != null) {
                }
            }
            if (string == null) {
                S.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                bVar = null;
            } else {
                bVar = (C2704y.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        }
        if (bVar != null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        C2704y cameraXConfig = bVar.getCameraXConfig();
        this.f4259c = cameraXConfig;
        F0 V11 = cameraXConfig.V();
        if (V11 != null) {
            S.a("CameraX", "QuirkSettings from CameraXConfig: " + V11);
        } else {
            V11 = (F0) h02.apply(context);
            S.a("CameraX", "QuirkSettings from app metadata: " + V11);
        }
        if (V11 == null) {
            V11 = G0.f38121b;
            S.a("CameraX", "QuirkSettings by default: " + V11);
        }
        G0.b().d(V11);
        Executor Q11 = cameraXConfig.Q();
        Handler W11 = cameraXConfig.W();
        this.f4260d = Q11 == null ? new ExecutorC2692l() : Q11;
        if (W11 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            handlerThread.start();
            this.f4261e = androidx.core.os.h.a(handlerThread.getLooper());
        } else {
            this.f4261e = W11;
        }
        Integer num = (Integer) cameraXConfig.c(C2704y.f4274M, null);
        synchronized (f4255m) {
            try {
                if (num != null) {
                    x2.i.c(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray<Integer> sparseArray = f4256n;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? sparseArray.get(num.intValue()).intValue() + 1 : 1));
                    if (sparseArray.size() == 0) {
                        S.i();
                    } else if (sparseArray.get(3) != null) {
                        S.j(3);
                    } else if (sparseArray.get(4) != null) {
                        S.j(4);
                    } else if (sparseArray.get(5) != null) {
                        S.j(5);
                    } else if (sparseArray.get(6) != null) {
                        S.j(6);
                    }
                }
            } finally {
            }
        }
        this.f4265i = new a0.a(cameraXConfig.T()).a();
        synchronized (this.f4258b) {
            x2.i.f("CameraX.initInternal() should only be called once per instance", this.f4267k == a.UNINITIALIZED);
            this.f4267k = a.INITIALIZING;
            a11 = androidx.concurrent.futures.b.a(new C2699t(this, context));
        }
        this.f4266j = a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [C.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(final int i11, final long j11, final C2703x c2703x, Context context, final b.a aVar, final Executor executor) {
        a0.b c11;
        c2703x.getClass();
        final Context a11 = G.f.a(context);
        try {
            G.a R11 = c2703x.f4259c.R();
            if (R11 == null) {
                throw new P(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            androidx.camera.core.impl.N a12 = androidx.camera.core.impl.N.a(c2703x.f4260d, c2703x.f4261e);
            C2697q P11 = c2703x.f4259c.P();
            c2703x.f4262f = R11.a(a11, a12, P11, c2703x.f4259c.S());
            F.a U10 = c2703x.f4259c.U();
            if (U10 == null) {
                throw new P(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            c2703x.f4263g = U10.a(a11, c2703x.f4262f.a(), c2703x.f4262f.c());
            c1.c X9 = c2703x.f4259c.X();
            if (X9 == null) {
                throw new P(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            c2703x.f4264h = X9.a(a11);
            if (executor instanceof ExecutorC2692l) {
                ((ExecutorC2692l) executor).a(c2703x.f4262f);
            }
            c2703x.f4257a.b(c2703x.f4262f);
            androidx.camera.core.impl.O.a(a11, c2703x.f4257a, P11);
            if (i11 > 1 && U4.a.b()) {
                U4.a.c(-1, "CX:CameraProvider-RetryStatus");
            }
            synchronized (c2703x.f4258b) {
                c2703x.f4267k = a.INITIALIZED;
            }
            aVar.c(null);
        } catch (P e11) {
            e = e11;
            androidx.camera.core.impl.J j12 = new androidx.camera.core.impl.J(j11, e);
            c11 = c2703x.f4265i.c(j12);
            if (U4.a.b()) {
                U4.a.c(j12.c(), "CX:CameraProvider-RetryStatus");
            }
            if (!c11.c() && i11 < Integer.MAX_VALUE) {
                StringBuilder d11 = C2702w.d(j11, "Retry init. Start time ", " current time ");
                d11.append(SystemClock.elapsedRealtime());
                S.l("CameraX", d11.toString(), e);
                androidx.core.os.h.c(c2703x.f4261e, new Runnable() { // from class: C.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a aVar2 = aVar;
                        int i12 = i11 + 1;
                        C2703x c2703x2 = c2703x;
                        c2703x2.getClass();
                        Context context2 = a11;
                        Executor executor2 = executor;
                        executor2.execute(new RunnableC2700u(i12, j11, c2703x2, context2, aVar2, executor2));
                    }
                }, c11.a());
                return;
            }
            synchronized (c2703x.f4258b) {
                c2703x.f4267k = a.INITIALIZING_ERROR;
            }
            if (c11.b()) {
                synchronized (c2703x.f4258b) {
                    c2703x.f4267k = a.INITIALIZED;
                }
                aVar.c(null);
                return;
            }
            if (!(e instanceof O.b)) {
                if (e instanceof P) {
                    aVar.e(e);
                    return;
                } else {
                    aVar.e(new P(e));
                    return;
                }
            }
            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((O.b) e).a();
            S.d("CameraX", str, e);
            aVar.e(new P(new C2698s(str)));
        } catch (O.b e12) {
            e = e12;
            androidx.camera.core.impl.J j122 = new androidx.camera.core.impl.J(j11, e);
            c11 = c2703x.f4265i.c(j122);
            if (U4.a.b()) {
            }
            if (!c11.c()) {
            }
            synchronized (c2703x.f4258b) {
            }
        } catch (RuntimeException e13) {
            e = e13;
            androidx.camera.core.impl.J j1222 = new androidx.camera.core.impl.J(j11, e);
            c11 = c2703x.f4265i.c(j1222);
            if (U4.a.b()) {
            }
            if (!c11.c()) {
            }
            synchronized (c2703x.f4258b) {
            }
        }
    }

    public static void b(C2703x c2703x, Context context, b.a aVar) {
        c2703x.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = c2703x.f4260d;
        executor.execute(new RunnableC2700u(1, elapsedRealtime, c2703x, context, aVar, executor));
    }

    @NonNull
    public final androidx.camera.core.impl.F c() {
        androidx.camera.core.impl.F f7 = this.f4263g;
        if (f7 != null) {
            return f7;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public final androidx.camera.core.impl.G d() {
        androidx.camera.core.impl.G g10 = this.f4262f;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public final androidx.camera.core.impl.L e() {
        return this.f4257a;
    }

    @NonNull
    public final c1 f() {
        c1 c1Var = this.f4264h;
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> g() {
        return this.f4266j;
    }
}
