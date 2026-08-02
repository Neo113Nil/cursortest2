package S0;

import S0.L0;
import Sc.r;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: S0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3957g implements InterfaceC3955f0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0<Unit> f25404a;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f25406c;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f25405b = new Object();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private ArrayList f25407d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private ArrayList f25408e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3954f f25409f = new C3954f(0);

    /* renamed from: S0.g$a */
    private static final class a<R> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<Long, R> f25410a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C10737n f25411b;

        public a(@NotNull Function1 function1, @NotNull C10737n c10737n) {
            this.f25410a = function1;
            this.f25411b = c10737n;
        }

        @NotNull
        public final kotlin.coroutines.d<R> a() {
            return this.f25411b;
        }

        public final void b(long j11) {
            Object a11;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = this.f25410a.invoke(Long.valueOf(j11));
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            this.f25411b.resumeWith(a11);
        }
    }

    /* renamed from: S0.g$b */
    static final class b extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<R> f25413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<R> aVar) {
            super(1);
            this.f25413c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Object obj = C3957g.this.f25405b;
            C3957g c3957g = C3957g.this;
            Object obj2 = this.f25413c;
            synchronized (obj) {
                ((ArrayList) c3957g.f25407d).remove(obj2);
                if (((ArrayList) c3957g.f25407d).isEmpty()) {
                    c3957g.f25409f.set(0);
                }
            }
            return Unit.f71690a;
        }
    }

    public C3957g(Function0<Unit> function0) {
        this.f25404a = function0;
    }

    public final boolean e() {
        return this.f25409f.get() != 0;
    }

    public final void f(long j11) {
        synchronized (this.f25405b) {
            try {
                ArrayList arrayList = this.f25407d;
                this.f25407d = this.f25408e;
                this.f25408e = arrayList;
                this.f25409f.set(0);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a) arrayList.get(i11)).b(j11);
                }
                arrayList.clear();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }

    @Override // S0.InterfaceC3955f0
    public final <R> Object v(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        a aVar = new a(function1, c10737n);
        synchronized (this.f25405b) {
            Throwable th2 = this.f25406c;
            if (th2 != null) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Sc.s.a(th2));
            } else {
                boolean isEmpty = this.f25407d.isEmpty();
                this.f25407d.add(aVar);
                if (isEmpty) {
                    this.f25409f.set(1);
                }
                c10737n.q(new b(aVar));
                if (isEmpty) {
                    try {
                        ((L0.e) this.f25404a).invoke();
                    } catch (Throwable th3) {
                        synchronized (this.f25405b) {
                            try {
                                if (this.f25406c == null) {
                                    this.f25406c = th3;
                                    ArrayList arrayList = this.f25407d;
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        kotlin.coroutines.d<R> a11 = ((a) arrayList.get(i11)).a();
                                        r.Companion companion2 = Sc.r.INSTANCE;
                                        ((C10737n) a11).resumeWith(Sc.s.a(th3));
                                    }
                                    this.f25407d.clear();
                                    this.f25409f.set(0);
                                    Unit unit = Unit.f71690a;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
