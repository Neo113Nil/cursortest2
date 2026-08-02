package C;

import E.C2908y;
import E.InterfaceC2907x;
import Q.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class I extends androidx.camera.core.w {

    /* renamed from: A, reason: collision with root package name */
    public static final c f4101A = new c();

    /* renamed from: p, reason: collision with root package name */
    private final int f4102p;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference<Integer> f4103q;

    /* renamed from: r, reason: collision with root package name */
    private final int f4104r;

    /* renamed from: s, reason: collision with root package name */
    private int f4105s;

    /* renamed from: t, reason: collision with root package name */
    private Rational f4106t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    private J.j f4107u;

    /* renamed from: v, reason: collision with root package name */
    O0.b f4108v;

    /* renamed from: w, reason: collision with root package name */
    private C2908y f4109w;

    /* renamed from: x, reason: collision with root package name */
    private E.Y f4110x;

    /* renamed from: y, reason: collision with root package name */
    private O0.c f4111y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC2907x f4112z;

    final class a implements InterfaceC2907x {
        a() {
        }

        @Override // E.InterfaceC2907x
        public final void a() {
            I.this.a0();
        }

        @Override // E.InterfaceC2907x
        public final void b() {
            I.this.g0();
        }

        @Override // E.InterfaceC2907x
        @NonNull
        public final com.google.common.util.concurrent.m<Void> c(@NonNull List<androidx.camera.core.impl.Q> list) {
            return I.this.d0(list);
        }
    }

    public static final class b implements b1.a<I, C5098i0, b> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f4114a;

        public b() {
            this(C5123v0.R());
        }

        @NonNull
        public static b d(@NonNull androidx.camera.core.impl.T t2) {
            return new b(C5123v0.S(t2));
        }

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            return this.f4114a;
        }

        @NonNull
        public final I c() {
            Object obj;
            Object obj2;
            Object obj3;
            T.a<Integer> aVar = C5098i0.f38316K;
            C5123v0 c5123v0 = this.f4114a;
            c5123v0.getClass();
            Object obj4 = null;
            try {
                obj = c5123v0.a(aVar);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                c5123v0.U(InterfaceC5100j0.f38330j, num);
            } else {
                c cVar = I.f4101A;
                try {
                    obj2 = c5123v0.a(C5098i0.f38317L);
                } catch (IllegalArgumentException unused2) {
                    obj2 = null;
                }
                if (Objects.equals(obj2, 1)) {
                    c5123v0.U(InterfaceC5100j0.f38330j, 4101);
                    c5123v0.U(InterfaceC5100j0.f38331k, A.f4075c);
                } else {
                    c5123v0.U(InterfaceC5100j0.f38330j, 256);
                }
            }
            C5098i0 b11 = b();
            InterfaceC5102k0.G(b11);
            I i11 = new I(b11);
            try {
                obj3 = c5123v0.a(InterfaceC5102k0.f38346p);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Size size = (Size) obj3;
            if (size != null) {
                i11.b0(new Rational(size.getWidth(), size.getHeight()));
            }
            T.a<Executor> aVar2 = J.h.f12636a;
            Object d11 = H.c.d();
            try {
                d11 = c5123v0.a(aVar2);
            } catch (IllegalArgumentException unused4) {
            }
            x2.i.e((Executor) d11, "The IO executor can't be null");
            T.a<Integer> aVar3 = C5098i0.f38314I;
            if (c5123v0.d(aVar3)) {
                Integer num2 = (Integer) c5123v0.a(aVar3);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException(J.b(num2, "The flash mode is not allowed to set: "));
                }
                if (num2.intValue() == 3) {
                    try {
                        obj4 = c5123v0.a(C5098i0.f38322Q);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (obj4 == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                }
            }
            return i11;
        }

        @Override // androidx.camera.core.impl.b1.a
        @NonNull
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final C5098i0 b() {
            return new C5098i0(A0.Q(this.f4114a));
        }

        @NonNull
        public final void f() {
            this.f4114a.U(C5098i0.f38313H, 1);
        }

        @NonNull
        public final void g() {
            A a11 = A.f4076d;
            this.f4114a.U(InterfaceC5100j0.f38331k, a11);
        }

        @NonNull
        public final void h(int i11) {
            this.f4114a.U(C5098i0.f38314I, Integer.valueOf(i11));
        }

        @NonNull
        public final void i(@NonNull Size size) {
            this.f4114a.U(InterfaceC5102k0.f38348r, size);
        }

        @NonNull
        public final void j() {
            this.f4114a.U(C5098i0.f38317L, 0);
        }

        @NonNull
        public final void k(@NonNull Q.b bVar) {
            this.f4114a.U(InterfaceC5102k0.f38350t, bVar);
        }

        @NonNull
        public final void l() {
            this.f4114a.U(b1.f38271z, 4);
        }

        @NonNull
        @Deprecated
        public final void m() {
            this.f4114a.U(InterfaceC5102k0.f38342l, 0);
        }

        @NonNull
        public final void n(@NonNull String str) {
            this.f4114a.U(J.m.f12651b, str);
        }

        @NonNull
        @Deprecated
        public final void o(@NonNull Size size) {
            this.f4114a.U(InterfaceC5102k0.f38346p, size);
        }

        private b(C5123v0 c5123v0) {
            Object obj;
            this.f4114a = c5123v0;
            Object obj2 = null;
            try {
                obj = c5123v0.a(J.m.f12652c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(I.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f4114a.U(b1.f38264D, c1.b.IMAGE_CAPTURE);
            T.a<Class<?>> aVar = J.m.f12652c;
            C5123v0 c5123v02 = this.f4114a;
            c5123v02.U(aVar, I.class);
            try {
                obj2 = c5123v02.a(J.m.f12651b);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                n(I.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final C5098i0 f4115a;

        static {
            b.a aVar = new b.a();
            aVar.d(Q.a.f22724a);
            aVar.f(Q.c.f22733c);
            Q.b a11 = aVar.a();
            b bVar = new b();
            bVar.l();
            bVar.m();
            bVar.k(a11);
            bVar.j();
            bVar.g();
            f4115a = bVar.b();
        }

        @NonNull
        public static C5098i0 a() {
            return f4115a;
        }
    }

    public static final class d {
        @NonNull
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    public static abstract class e {
    }

    public interface f {
        default void onCaptureProcessProgressed(int i11) {
        }

        default void onCaptureStarted() {
        }

        void onError(@NonNull K k11);

        void onImageSaved(@NonNull h hVar);

        default void onPostviewBitmapAvailable(@NonNull Bitmap bitmap) {
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final File f4116a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final d f4117b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private File f4118a;

            /* renamed from: b, reason: collision with root package name */
            private d f4119b;

            public a(@NonNull File file) {
                this.f4118a = file;
            }

            @NonNull
            public final g a() {
                return new g(this.f4118a, this.f4119b);
            }

            @NonNull
            public final void b(@NonNull d dVar) {
                this.f4119b = dVar;
            }
        }

        g(File file, d dVar) {
            this.f4116a = file;
            this.f4117b = dVar == null ? new d() : dVar;
        }

        public final File a() {
            return this.f4116a;
        }

        @NonNull
        public final d b() {
            return this.f4117b;
        }

        @NonNull
        public final String toString() {
            return "OutputFileOptions{mFile=" + this.f4116a + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + this.f4117b + "}";
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f4120a;

        public h(Uri uri) {
            this.f4120a = uri;
        }

        public final Uri a() {
            return this.f4120a;
        }
    }

    public interface i {
        void a(long j11, @NonNull j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    I(@NonNull C5098i0 c5098i0) {
        super(c5098i0);
        this.f4103q = new AtomicReference<>(null);
        this.f4105s = -1;
        this.f4106t = null;
        this.f4112z = new a();
        C5098i0 c5098i02 = (C5098i0) i();
        T.a<Integer> aVar = C5098i0.f38313H;
        if (c5098i02.d(aVar)) {
            this.f4102p = ((Integer) c5098i02.a(aVar)).intValue();
        } else {
            this.f4102p = 1;
        }
        this.f4104r = ((Integer) c5098i02.c(C5098i0.f38320O, 0)).intValue();
        this.f4107u = new J.j((i) c5098i02.c(C5098i0.f38322Q, null));
    }

    public static void V(I i11) {
        if (i11.f() == null) {
            return;
        }
        i11.f4110x.f();
        i11.W(true);
        String h11 = i11.h();
        C5098i0 c5098i0 = (C5098i0) i11.i();
        T0 d11 = i11.d();
        d11.getClass();
        O0.b X9 = i11.X(h11, c5098i0, d11);
        i11.f4108v = X9;
        Object[] objArr = {X9.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        i11.S(Collections.unmodifiableList(arrayList));
        i11.D();
        i11.f4110x.g();
    }

    private void W(boolean z11) {
        E.Y y11;
        Log.d("ImageCapture", "clearPipeline");
        G.q.a();
        O0.c cVar = this.f4111y;
        if (cVar != null) {
            cVar.b();
            this.f4111y = null;
        }
        C2908y c2908y = this.f4109w;
        if (c2908y != null) {
            c2908y.a();
            this.f4109w = null;
        }
        if (z11 || (y11 = this.f4110x) == null) {
            return;
        }
        y11.c();
        this.f4110x = null;
    }

    private O0.b X(@NonNull String str, @NonNull C5098i0 c5098i0, @NonNull T0 t02) {
        G.q.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, t02));
        Size e11 = t02.e();
        androidx.camera.core.impl.I f7 = f();
        Objects.requireNonNull(f7);
        boolean z11 = !f7.p();
        Size size = null;
        if (this.f4109w != null) {
            x2.i.f(null, z11);
            this.f4109w.a();
        }
        int i11 = 35;
        if (((Boolean) i().c(C5098i0.f38324S, Boolean.FALSE)).booleanValue() && f().l().H() != null) {
            Q.b bVar = (Q.b) i().c(C5098i0.f38323R, null);
            Map map = Collections.EMPTY_MAP;
            List list = (List) map.get(35);
            if (list == null || list.isEmpty()) {
                i11 = 256;
                list = (List) map.get(256);
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (bVar != null) {
                    Collections.sort(list2, new G.e(true));
                    androidx.camera.core.impl.I f11 = f();
                    Rect k11 = f11.k().k();
                    androidx.camera.core.impl.H e12 = f11.e();
                    ArrayList e13 = J.k.e(bVar, list2, null, v(), new Rational(k11.width(), k11.height()), e12.i(), e12.e());
                    if (e13.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = (Size) e13.get(0);
                } else {
                    size = (Size) Collections.max(list2, new G.e(false));
                }
            }
        }
        this.f4109w = new C2908y(c5098i0, e11, k(), z11, size, i11);
        if (this.f4110x == null) {
            this.f4110x = new E.Y(this.f4112z);
        }
        this.f4110x.i(this.f4109w);
        O0.b c11 = this.f4109w.c(t02.e());
        if (this.f4102p == 2 && !t02.f()) {
            g().m(c11);
        }
        if (t02.d() != null) {
            c11.e(t02.d());
        }
        O0.c cVar = this.f4111y;
        if (cVar != null) {
            cVar.b();
        }
        O0.c cVar2 = new O0.c(new O0.d() { // from class: C.G
            @Override // androidx.camera.core.impl.O0.d
            public final void a(O0 o02, O0.g gVar) {
                I.V(I.this);
            }
        });
        this.f4111y = cVar2;
        c11.p(cVar2);
        return c11;
    }

    private static boolean Z(int i11, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i11))) {
                return true;
            }
        }
        return false;
    }

    private void f0() {
        synchronized (this.f4103q) {
            try {
                if (this.f4103q.get() != null) {
                    return;
                }
                g().b(Y());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.w
    public final void G() {
        x2.i.e(f(), "Attached camera cannot be null");
        if (Y() == 3) {
            androidx.camera.core.impl.I f7 = f();
            if ((f7 != null ? f7.b().e() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // androidx.camera.core.w
    public final void H() {
        S.a("ImageCapture", "onCameraControlReady");
        f0();
        g().h(this.f4107u);
    }

    /* JADX WARN: Type inference failed for: r9v31, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @Override // androidx.camera.core.w
    @NonNull
    protected final b1<?> I(@NonNull androidx.camera.core.impl.H h11, @NonNull b1.a<?, ?, ?> aVar) {
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        if (h11.l().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            Object a11 = aVar.a();
            T.a<Boolean> aVar2 = C5098i0.f38319N;
            Object obj4 = Boolean.TRUE;
            A0 a02 = (A0) a11;
            a02.getClass();
            try {
                obj4 = a02.a(aVar2);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj4)) {
                S.k("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                S.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                ((C5123v0) aVar.a()).U(C5098i0.f38319N, Boolean.TRUE);
            }
        }
        Object a12 = aVar.a();
        Boolean bool2 = Boolean.TRUE;
        T.a<Boolean> aVar3 = C5098i0.f38319N;
        Object obj5 = Boolean.FALSE;
        A0 a03 = (A0) a12;
        a03.getClass();
        try {
            obj5 = a03.a(aVar3);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z12 = true;
        if (equals) {
            if (f() == null || f().l().H() == null) {
                z11 = true;
            } else {
                S.k("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z11 = false;
            }
            try {
                obj3 = a03.a(C5098i0.f38316K);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num != null && num.intValue() != 256) {
                S.k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z11 = false;
            }
            if (!z11) {
                S.k("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((C5123v0) a12).U(C5098i0.f38319N, Boolean.FALSE);
            }
        } else {
            z11 = false;
        }
        Object a13 = aVar.a();
        T.a<Integer> aVar4 = C5098i0.f38316K;
        A0 a04 = (A0) a13;
        a04.getClass();
        try {
            obj = a04.a(aVar4);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            if (f() != null && f().l().H() != null && num2.intValue() != 256) {
                z12 = false;
            }
            x2.i.a("Cannot set non-JPEG buffer format with Extensions enabled.", z12);
            ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, Integer.valueOf(z11 ? 35 : num2.intValue()));
        } else {
            Object a14 = aVar.a();
            T.a<Integer> aVar5 = C5098i0.f38317L;
            A0 a05 = (A0) a14;
            a05.getClass();
            try {
                obj2 = a05.a(aVar5);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 4101);
                ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38331k, A.f4075c);
            } else if (z11) {
                ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 35);
            } else {
                Object a15 = aVar.a();
                T.a<List<Pair<Integer, Size[]>>> aVar6 = InterfaceC5102k0.f38349s;
                A0 a06 = (A0) a15;
                a06.getClass();
                try {
                    obj6 = a06.a(aVar6);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 256);
                } else if (Z(256, list)) {
                    ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 256);
                } else if (Z(35, list)) {
                    ((C5123v0) aVar.a()).U(InterfaceC5100j0.f38330j, 35);
                }
            }
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    public final void K() {
        this.f4107u.e();
        E.Y y11 = this.f4110x;
        if (y11 != null) {
            y11.c();
        }
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 L(@NonNull androidx.camera.core.impl.T t2) {
        this.f4108v.e(t2);
        Object[] objArr = {this.f4108v.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        T0.a g10 = d().g();
        g10.d(t2);
        return g10.a();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 M(@NonNull T0 t02, T0 t03) {
        O0.b X9 = X(h(), (C5098i0) i(), t02);
        this.f4108v = X9;
        Object[] objArr = {X9.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        B();
        return t02;
    }

    @Override // androidx.camera.core.w
    public final void N() {
        this.f4107u.e();
        E.Y y11 = this.f4110x;
        if (y11 != null) {
            y11.c();
        }
        W(false);
        g().h(null);
    }

    public final int Y() {
        int i11;
        synchronized (this.f4103q) {
            i11 = this.f4105s;
            if (i11 == -1) {
                i11 = ((Integer) ((C5098i0) i()).c(C5098i0.f38314I, 2)).intValue();
            }
        }
        return i11;
    }

    final void a0() {
        synchronized (this.f4103q) {
            try {
                if (this.f4103q.get() != null) {
                    return;
                }
                this.f4103q.set(Integer.valueOf(Y()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b0(@NonNull Rational rational) {
        this.f4106t = rational;
    }

    public final void c0(int i11) {
        S.a("ImageCapture", "setFlashMode: flashMode = " + i11);
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Invalid flash mode: "));
            }
            if (this.f4107u.f() == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (f() != null) {
                androidx.camera.core.impl.I f7 = f();
                if ((f7 != null ? f7.b().e() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (this.f4103q) {
            this.f4105s = i11;
            f0();
        }
    }

    final com.google.common.util.concurrent.m<Void> d0(@NonNull List<androidx.camera.core.impl.Q> list) {
        G.q.a();
        return I.k.m(g().j(this.f4102p, this.f4104r, list), new H(), H.c.b());
    }

    public final void e0(@NonNull final g gVar, @NonNull final Executor executor, @NonNull final f fVar) {
        int i11;
        int round;
        int i12;
        int i13;
        int i14;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            H.c.e().execute(new Runnable() { // from class: C.F
                @Override // java.lang.Runnable
                public final void run() {
                    I.this.e0(gVar, executor, fVar);
                }
            });
            return;
        }
        G.q.a();
        if (Y() == 3 && this.f4107u.f() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        androidx.camera.core.impl.I f7 = f();
        Rect rect = null;
        if (f7 == null) {
            K k11 = new K("Not bound to a valid Camera [" + this + "]", null);
            if (fVar == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            fVar.onError(k11);
            return;
        }
        E.Y y11 = this.f4110x;
        Objects.requireNonNull(y11);
        Rect x11 = x();
        Size e11 = e();
        Objects.requireNonNull(e11);
        if (x11 == null) {
            Rational rational = this.f4106t;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                x11 = new Rect(0, 0, e11.getWidth(), e11.getHeight());
            } else {
                androidx.camera.core.impl.I f11 = f();
                Objects.requireNonNull(f11);
                int p11 = p(f11, false);
                Rational rational2 = new Rational(this.f4106t.getDenominator(), this.f4106t.getNumerator());
                if (!G.r.c(p11)) {
                    rational2 = this.f4106t;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    S.k("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = e11.getWidth();
                    int height = e11.getHeight();
                    float f12 = width;
                    float f13 = height;
                    float f14 = f12 / f13;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f14) {
                        int round2 = Math.round((f12 / numerator) * denominator);
                        i14 = (height - round2) / 2;
                        i13 = round2;
                        round = width;
                        i12 = 0;
                    } else {
                        round = Math.round((f13 / denominator) * numerator);
                        i12 = (width - round) / 2;
                        i13 = height;
                        i14 = 0;
                    }
                    rect = new Rect(i12, i14, round + i12, i13 + i14);
                }
                Objects.requireNonNull(rect);
                x11 = rect;
            }
        }
        Matrix s11 = s();
        int p12 = p(f7, false);
        C5098i0 c5098i0 = (C5098i0) i();
        T.a<Integer> aVar = C5098i0.f38321P;
        if (c5098i0.d(aVar)) {
            i11 = ((Integer) c5098i0.a(aVar)).intValue();
        } else {
            int i15 = this.f4102p;
            if (i15 == 0) {
                i11 = 100;
            } else {
                if (i15 != 1 && i15 != 2) {
                    throw new IllegalStateException(T7.E.a(i15, "CaptureMode ", " is invalid"));
                }
                i11 = 95;
            }
        }
        y11.e(E.d0.l(executor, fVar, gVar, x11, s11, p12, i11, this.f4102p, this.f4108v.n()));
    }

    final void g0() {
        synchronized (this.f4103q) {
            try {
                Integer andSet = this.f4103q.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != Y()) {
                    f0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.w
    public final b1<?> j(boolean z11, @NonNull c1 c1Var) {
        f4101A.getClass();
        androidx.camera.core.impl.T a11 = c1Var.a(c.a().N(), this.f4102p);
        if (z11) {
            a11 = androidx.camera.core.impl.T.O(a11, c.a());
        }
        if (a11 == null) {
            return null;
        }
        return b.d(a11).b();
    }

    @NonNull
    public final String toString() {
        return "ImageCapture:".concat(n());
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final b1.a<?, ?, ?> w(@NonNull androidx.camera.core.impl.T t2) {
        return b.d(t2);
    }
}
