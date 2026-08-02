package S0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3993x0 implements InterfaceC3955f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3955f0 f25582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3943b0 f25583b = new C3943b0();

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* renamed from: S0.x0$a */
    static final class a<R> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C3993x0 f25584d;

        /* renamed from: e, reason: collision with root package name */
        Function1 f25585e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25586f;

        /* renamed from: h, reason: collision with root package name */
        int f25588h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25586f = obj;
            this.f25588h |= LinearLayoutManager.INVALID_OFFSET;
            return C3993x0.this.v(null, this);
        }
    }

    public C3993x0(@NotNull InterfaceC3955f0 interfaceC3955f0) {
        this.f25582a = interfaceC3955f0;
    }

    public final void a() {
        this.f25583b.d();
    }

    public final void b() {
        this.f25583b.e();
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // S0.InterfaceC3955f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object v(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        a aVar;
        int i11;
        C3993x0 c3993x0;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f25588h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f25588h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f25586f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f25588h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f25584d = this;
                    aVar.f25585e = function1;
                    aVar.f25588h = 1;
                    if (this.f25583b.c(aVar) != aVar2) {
                        c3993x0 = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                function1 = aVar.f25585e;
                c3993x0 = aVar.f25584d;
                Sc.s.b(obj);
                InterfaceC3955f0 interfaceC3955f0 = c3993x0.f25582a;
                aVar.f25584d = null;
                aVar.f25585e = null;
                aVar.f25588h = 2;
                Object v11 = interfaceC3955f0.v(function1, aVar);
                return v11 != aVar2 ? aVar2 : v11;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f25586f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f25588h;
        if (i11 != 0) {
        }
        InterfaceC3955f0 interfaceC3955f02 = c3993x0.f25582a;
        aVar.f25584d = null;
        aVar.f25585e = null;
        aVar.f25588h = 2;
        Object v112 = interfaceC3955f02.v(function1, aVar);
        if (v112 != aVar22) {
        }
    }
}
