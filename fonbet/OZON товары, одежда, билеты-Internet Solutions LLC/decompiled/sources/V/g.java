package V;

import C.C2695o;
import C.C2697q;
import C.C2703x;
import C.InterfaceC2693m;
import C.InterfaceC2694n;
import C.InterfaceC2696p;
import C.Q;
import G.q;
import I.k;
import J.f;
import android.content.Context;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC5094g0;
import androidx.camera.core.impl.C5088d0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.M0;
import androidx.camera.core.w;
import androidx.concurrent.futures.b;
import androidx.lifecycle.J;
import com.google.common.util.concurrent.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
public final class g implements InterfaceC2696p {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final g f27883h = new g();

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f27884i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f27885a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private m<C2703x> f27886b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private m<Void> f27887c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f27888d;

    /* renamed from: e, reason: collision with root package name */
    private C2703x f27889e;

    /* renamed from: f, reason: collision with root package name */
    private Context f27890f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final HashMap f27891g;

    public static final class a {

        /* renamed from: V.g$a$a, reason: collision with other inner class name */
        static final class C0567a extends AbstractC7737t implements Function1<C2703x, g> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f27892b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0567a(Context context) {
                super(1);
                this.f27892b = context;
            }

            @Override // kotlin.jvm.functions.Function1
            public final g invoke(C2703x c2703x) {
                C2703x cameraX = c2703x;
                g gVar = g.f27883h;
                Intrinsics.checkNotNullExpressionValue(cameraX, "cameraX");
                g.d(gVar, cameraX);
                g gVar2 = g.f27883h;
                Context a11 = G.f.a(this.f27892b);
                Intrinsics.checkNotNullExpressionValue(a11, "getApplicationContext(context)");
                g.e(gVar2, a11);
                return g.f27883h;
            }
        }

        @NotNull
        public static m a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.getClass();
            m b11 = g.b(g.f27883h, context);
            final C0567a c0567a = new C0567a(context);
            m m11 = k.m(b11, new InterfaceC8822a() { // from class: V.f
                @Override // p.InterfaceC8822a
                public final Object apply(Object obj) {
                    Function1 tmp0 = Function1.this;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (g) tmp0.invoke(obj);
                }
            }, H.c.b());
            Intrinsics.checkNotNullExpressionValue(m11, "context: Context): Liste…tExecutor()\n            )");
            return m11;
        }
    }

    private g() {
        m<Void> h11 = k.h(null);
        Intrinsics.checkNotNullExpressionValue(h11, "immediateFuture<Void>(null)");
        this.f27887c = h11;
        this.f27888d = new c();
        this.f27891g = new HashMap();
    }

    public static void a(g this$0, C2703x cameraX, b.a completer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraX, "$cameraX");
        Intrinsics.checkNotNullParameter(completer, "completer");
        synchronized (this$0.f27885a) {
            I.d b11 = I.d.b(this$0.f27887c);
            AJ.d dVar = new AJ.d(new i(cameraX), 3);
            Executor b12 = H.c.b();
            b11.getClass();
            I.d dVar2 = (I.d) k.n(b11, dVar, b12);
            Intrinsics.checkNotNullExpressionValue(dVar2, "cameraX = CameraX(contex…                        )");
            k.b(dVar2, new h(completer, cameraX), H.c.b());
            Unit unit = Unit.f71690a;
        }
    }

    public static final m b(final g gVar, Context context) {
        synchronized (gVar.f27885a) {
            m<C2703x> mVar = gVar.f27886b;
            if (mVar != null) {
                return mVar;
            }
            final C2703x c2703x = new C2703x(context);
            m<C2703x> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: V.d
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    g.a(g.this, c2703x, aVar);
                    return "ProcessCameraProvider-initializeCameraX";
                }
            });
            gVar.f27886b = a11;
            return a11;
        }
    }

    public static final void d(g gVar, C2703x c2703x) {
        gVar.f27889e = c2703x;
    }

    public static final void e(g gVar, Context context) {
        gVar.f27890f = context;
    }

    /* JADX WARN: Type inference failed for: r20v1, types: [androidx.camera.core.impl.I, androidx.camera.core.impl.M0] */
    @NotNull
    public final b f(@NotNull J lifecycleOwner, @NotNull C2697q cameraSelector, @NotNull w... useCases) {
        Object obj;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        C2703x c2703x = this.f27889e;
        if ((c2703x == null ? 0 : c2703x.d().d().b()) == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        C2703x c2703x2 = this.f27889e;
        if (c2703x2 != null) {
            c2703x2.d().d().d(1);
        }
        Q secondaryLayoutSettings = Q.f4125c;
        Intrinsics.checkNotNullExpressionValue(secondaryLayoutSettings, "DEFAULT");
        Intrinsics.checkNotNullExpressionValue(secondaryLayoutSettings, "DEFAULT");
        K effects = K.f71697a;
        w[] useCases2 = (w[]) Arrays.copyOf(useCases, useCases.length);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases2, "useCases");
        q.a();
        C2703x c2703x3 = this.f27889e;
        Intrinsics.f(c2703x3);
        I d11 = cameraSelector.d(c2703x3.e().a());
        Intrinsics.checkNotNullExpressionValue(d11, "primaryCameraSelector.se…cameraRepository.cameras)");
        d11.i(true);
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        C2703x c2703x4 = this.f27889e;
        Intrinsics.f(c2703x4);
        H e11 = cameraSelector.d(c2703x4.e().a()).e();
        Intrinsics.checkNotNullExpressionValue(e11, "cameraSelector.select(mC…meras).cameraInfoInternal");
        Iterator<InterfaceC2693m> it = cameraSelector.b().iterator();
        while (it.hasNext()) {
            InterfaceC2693m next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "cameraSelector.cameraFilterSet");
            next.getClass();
            AbstractC5094g0 abstractC5094g0 = InterfaceC2693m.f4207a;
            if (!Intrinsics.d(abstractC5094g0, abstractC5094g0)) {
                C5088d0.a(abstractC5094g0);
                Intrinsics.f(this.f27890f);
            }
        }
        A a11 = D.a();
        f.b a12 = f.b.a(e11.b(), a11.B());
        Intrinsics.checkNotNullExpressionValue(a12, "create(\n                …ilityId\n                )");
        synchronized (this.f27885a) {
            try {
                obj = this.f27891g.get(a12);
                if (obj == null) {
                    obj = new M0(e11, a11);
                    this.f27891g.put(a12, obj);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        M0 m02 = (M0) obj;
        Object obj2 = null;
        f.b v11 = J.f.v(m02, null);
        c cVar = this.f27888d;
        b c11 = cVar.c(lifecycleOwner, v11);
        Collection<b> e12 = cVar.e();
        Iterator it2 = C7705l.B(useCases2).iterator();
        while (it2.hasNext()) {
            w wVar = (w) it2.next();
            for (b lifecycleCameras : e12) {
                Object obj3 = obj2;
                Intrinsics.checkNotNullExpressionValue(lifecycleCameras, "lifecycleCameras");
                b bVar = lifecycleCameras;
                if (bVar.t(wVar) && !bVar.equals(c11)) {
                    throw new IllegalStateException(e.b(new Object[]{wVar}, 1, "Use case %s already bound to a different lifecycle.", "format(format, *args)"));
                }
                obj2 = obj3;
            }
        }
        ?? r202 = obj2;
        if (c11 == null) {
            C2703x c2703x5 = this.f27889e;
            Intrinsics.f(c2703x5);
            A.a d12 = c2703x5.d().d();
            C2703x c2703x6 = this.f27889e;
            Intrinsics.f(c2703x6);
            F c12 = c2703x6.c();
            C2703x c2703x7 = this.f27889e;
            Intrinsics.f(c2703x7);
            c11 = cVar.b(lifecycleOwner, new J.f(d11, r202, m02, r202, secondaryLayoutSettings, secondaryLayoutSettings, d12, c12, c2703x7.f()));
        }
        if (useCases2.length == 0) {
            return c11;
        }
        List b02 = C7714v.b0(Arrays.copyOf(useCases2, useCases2.length));
        C2703x c2703x8 = this.f27889e;
        Intrinsics.f(c2703x8);
        cVar.a(c11, effects, b02, c2703x8.d().d());
        return c11;
    }

    @NotNull
    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        C2703x c2703x = this.f27889e;
        Intrinsics.f(c2703x);
        LinkedHashSet<I> a11 = c2703x.e().a();
        Intrinsics.checkNotNullExpressionValue(a11, "mCameraX!!.cameraRepository.cameras");
        Iterator<I> it = a11.iterator();
        while (it.hasNext()) {
            InterfaceC2694n b11 = it.next().b();
            Intrinsics.checkNotNullExpressionValue(b11, "camera.cameraInfo");
            arrayList.add(b11);
        }
        return arrayList;
    }

    public final boolean h(@NotNull C2697q cameraSelector) throws C2695o {
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        try {
            C2703x c2703x = this.f27889e;
            Intrinsics.f(c2703x);
            cameraSelector.d(c2703x.e().a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void i(@NotNull w... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        q.a();
        C2703x c2703x = this.f27889e;
        if ((c2703x == null ? 0 : c2703x.d().d().b()) == 2) {
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        }
        this.f27888d.k(C7714v.b0(Arrays.copyOf(useCases, useCases.length)));
        Unit unit = Unit.f71690a;
    }

    public final void j() {
        q.a();
        C2703x c2703x = this.f27889e;
        if (c2703x != null) {
            c2703x.d().d().d(0);
        }
        this.f27888d.l();
        Unit unit = Unit.f71690a;
    }
}
