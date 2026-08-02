package Fe;

import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Be.E;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.h;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import xe.E0;
import xe.N;
import ze.EnumC11113a;
import ze.h;
import ze.u;

/* loaded from: classes.dex */
final class b<T> extends AbstractC2635g<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f9416d;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {94, 96}, m = "collectImpl")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f9417d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC2397i f9418e;

        /* renamed from: f, reason: collision with root package name */
        Object f9419f;

        /* renamed from: g, reason: collision with root package name */
        long f9420g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f9421h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ b<T> f9422i;

        /* renamed from: j, reason: collision with root package name */
        int f9423j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f9422i = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9421h = obj;
            this.f9423j |= LinearLayoutManager.INVALID_OFFSET;
            return b.h(this.f9422i, this);
        }
    }

    public b(@NotNull h hVar, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i11, enumC11113a);
        this.f9416d = hVar;
    }

    public static final /* synthetic */ Object h(b bVar, kotlin.coroutines.d dVar) {
        return bVar.i(null, null, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r0 == r3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:12:0x0038, B:14:0x00af, B:16:0x00bb, B:19:0x0079, B:26:0x0097, B:33:0x0055), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r11v1, types: [Ae.i] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Fe.f] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8, types: [Fe.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ac -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(CoroutineContext coroutineContext, InterfaceC2397i<? super T> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        ?? r42;
        f fVar;
        b<T> bVar;
        long j11;
        InterfaceC2397i<? super T> interfaceC2397i2;
        b<T> bVar2;
        ?? r11;
        long j12;
        f fVar2;
        Object c11;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f9423j;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f9423j = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f9421h;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    r42 = aVar.f9423j;
                    if (r42 != 0) {
                        s.b(obj);
                        f fVar3 = new f(this.f3580b, this.f3581c, j());
                        d.b(this.f9416d, coroutineContext).a(fVar3);
                        fVar = fVar3;
                        bVar = this;
                        j11 = 0;
                        interfaceC2397i2 = interfaceC2397i;
                        aVar.f9417d = bVar;
                        aVar.f9418e = interfaceC2397i2;
                        aVar.f9419f = fVar;
                        aVar.f9420g = j11;
                        aVar.f9423j = 1;
                        c11 = fVar.c(aVar);
                        if (c11 != aVar2) {
                        }
                        return aVar2;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j12 = aVar.f9420g;
                        f fVar4 = (f) aVar.f9419f;
                        InterfaceC2397i<? super T> interfaceC2397i3 = aVar.f9418e;
                        bVar2 = (b) aVar.f9417d;
                        s.b(obj);
                        r42 = fVar4;
                        InterfaceC2397i<? super T> interfaceC2397i4 = interfaceC2397i3;
                        interfaceC2397i2 = interfaceC2397i4;
                        j11 = j12 + 1;
                        if (j11 == bVar2.j()) {
                            r42.b();
                            j11 = 0;
                        }
                        bVar = bVar2;
                        fVar = r42;
                        aVar.f9417d = bVar;
                        aVar.f9418e = interfaceC2397i2;
                        aVar.f9419f = fVar;
                        aVar.f9420g = j11;
                        aVar.f9423j = 1;
                        c11 = fVar.c(aVar);
                        if (c11 != aVar2) {
                            r11 = interfaceC2397i2;
                            obj = c11;
                            bVar2 = bVar;
                            j12 = j11;
                            fVar2 = fVar;
                            if (obj != null) {
                                fVar2.a();
                                return Unit.f71690a;
                            }
                            E0.f(aVar.getContext());
                            aVar.f9417d = bVar2;
                            aVar.f9418e = r11;
                            aVar.f9419f = fVar2;
                            aVar.f9420g = j12;
                            aVar.f9423j = 2;
                            Object emit = r11.emit(obj, aVar);
                            r42 = fVar2;
                            interfaceC2397i4 = r11;
                        }
                        return aVar2;
                    }
                    j12 = aVar.f9420g;
                    f fVar5 = (f) aVar.f9419f;
                    InterfaceC2397i interfaceC2397i5 = aVar.f9418e;
                    bVar2 = (b) aVar.f9417d;
                    s.b(obj);
                    fVar2 = fVar5;
                    r11 = interfaceC2397i5;
                    if (obj != null) {
                    }
                }
            }
            if (r42 != 0) {
            }
        } catch (Throwable th2) {
            r42.a();
            throw th2;
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f9421h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        r42 = aVar.f9423j;
    }

    private final long j() {
        if (this.f3581c != EnumC11113a.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i11 = this.f3580b;
        if (i11 == -2) {
            ze.h.f108943q0.getClass();
            return h.a.a();
        }
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j11 = i11;
        if (j11 >= 1) {
            return j11;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // Be.AbstractC2635g, Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        CoroutineContext context = dVar.getContext();
        e.Companion companion = kotlin.coroutines.e.INSTANCE;
        CoroutineContext coroutineContext = this.f3579a;
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(companion);
        if (eVar == null || eVar.equals(context.get(companion))) {
            Object i11 = i(context.plus(coroutineContext), interfaceC2397i, dVar);
            return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
        }
        Object d11 = N.d(new c(interfaceC2397i, this, null), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (d11 != aVar) {
            d11 = Unit.f71690a;
        }
        return d11 == aVar ? d11 : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    protected final Object d(@NotNull u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object i11 = i(uVar.getCoroutineContext(), new E(uVar.k()), dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new b(this.f9416d, coroutineContext, i11, enumC11113a);
    }
}
