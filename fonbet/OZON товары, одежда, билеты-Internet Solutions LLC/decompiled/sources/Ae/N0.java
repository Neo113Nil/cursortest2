package Ae;

import Be.AbstractC2630b;
import Be.AbstractC2632d;
import De.C2857A;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
final class N0<T> extends AbstractC2630b<P0> implements x0<T>, InterfaceC2385c<T>, Be.w<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f860f = AtomicReferenceFieldUpdater.newUpdater(N0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    private int f861e;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "collect")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f862d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC2397i f863e;

        /* renamed from: f, reason: collision with root package name */
        Object f864f;

        /* renamed from: g, reason: collision with root package name */
        xe.B0 f865g;

        /* renamed from: h, reason: collision with root package name */
        Object f866h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f867i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ N0<T> f868j;

        /* renamed from: k, reason: collision with root package name */
        int f869k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N0<T> n02, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f868j = n02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f867i = obj;
            this.f869k |= LinearLayoutManager.INVALID_OFFSET;
            return this.f868j.collect(null, this);
        }
    }

    public N0(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    private final boolean k(Object obj, Object obj2) {
        int i11;
        P0[] j11;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.d(obj3, obj)) {
                return false;
            }
            if (Intrinsics.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i12 = this.f861e;
            if ((i12 & 1) != 0) {
                this.f861e = i12 + 2;
                return true;
            }
            int i13 = i12 + 1;
            this.f861e = i13;
            P0[] j12 = j();
            Unit unit = Unit.f71690a;
            while (true) {
                P0[] p0Arr = j12;
                if (p0Arr != null) {
                    for (P0 p02 : p0Arr) {
                        if (p02 != null) {
                            p02.d();
                        }
                    }
                }
                synchronized (this) {
                    i11 = this.f861e;
                    if (i11 == i13) {
                        this.f861e = i13 + 1;
                        return true;
                    }
                    j11 = j();
                    Unit unit2 = Unit.f71690a;
                }
                j12 = j11;
                i13 = i11;
            }
        }
    }

    @Override // Be.w
    @NotNull
    public final InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || enumC11113a != EnumC11113a.DROP_OLDEST) ? E0.d(this, coroutineContext, i11, enumC11113a) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [De.A] */
    @Override // Ae.x0
    public final boolean b(T t2, T t11) {
        ?? r02 = Be.z.f3696a;
        if (t2 == null) {
            t2 = r02;
        }
        if (t11 == null) {
            t11 = r02;
        }
        return k(t2, t11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        r9 = r11.equals(r12);
        r6 = r6;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r9 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        if (((Ae.R0) r11).a(r0) == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x00a2, B:16:0x00aa, B:19:0x00b1, B:20:0x00b5, B:24:0x00b8, B:26:0x00d9, B:28:0x00df, B:31:0x00be, B:34:0x00c5, B:42:0x0056, B:44:0x0067, B:45:0x0093), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x00a2, B:16:0x00aa, B:19:0x00b1, B:20:0x00b5, B:24:0x00b8, B:26:0x00d9, B:28:0x00df, B:31:0x00be, B:34:0x00c5, B:42:0x0056, B:44:0x0067, B:45:0x0093), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [Be.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00dd -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ef -> B:14:0x00a2). Please report as a decompilation issue!!! */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        Wc.a aVar2;
        int i11;
        N0<T> n02;
        P0 p02;
        InterfaceC2397i interfaceC2397i2;
        xe.B0 b02;
        ?? r11;
        Object obj;
        P0 p03;
        boolean e11;
        T t2;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i12 = aVar.f869k;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f869k = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = aVar.f867i;
                    aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f869k;
                    ?? r62 = 1;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        P0 e12 = e();
                        try {
                            if (interfaceC2397i instanceof R0) {
                                aVar.f862d = this;
                                aVar.f863e = interfaceC2397i;
                                aVar.f864f = e12;
                                aVar.f869k = 1;
                            }
                            n02 = this;
                            p02 = e12;
                        } catch (Throwable th2) {
                            th = th2;
                            n02 = this;
                            r62 = e12;
                            n02.h(r62);
                            throw th;
                        }
                    } else if (i11 == 1) {
                        P0 p04 = (P0) aVar.f864f;
                        interfaceC2397i = aVar.f863e;
                        n02 = (N0) aVar.f862d;
                        Sc.s.b(obj2);
                        p02 = p04;
                    } else if (i11 == 2) {
                        Object obj3 = aVar.f866h;
                        b02 = aVar.f865g;
                        P0 p05 = (P0) aVar.f864f;
                        interfaceC2397i2 = aVar.f863e;
                        n02 = (N0) aVar.f862d;
                        Sc.s.b(obj2);
                        p03 = p05;
                        obj = obj3;
                        e11 = p03.e();
                        r62 = p03;
                        r11 = obj;
                        if (!e11) {
                        }
                        ?? r12 = f860f.get(n02);
                        if (b02 != null) {
                        }
                        if (r12 == Be.z.f3696a) {
                        }
                        aVar.f862d = n02;
                        aVar.f863e = interfaceC2397i2;
                        aVar.f864f = r62;
                        aVar.f865g = b02;
                        aVar.f866h = r12;
                        aVar.f869k = 2;
                        if (interfaceC2397i2.emit(t2, aVar) == aVar2) {
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj4 = aVar.f866h;
                        b02 = aVar.f865g;
                        P0 p06 = (P0) aVar.f864f;
                        interfaceC2397i2 = aVar.f863e;
                        n02 = (N0) aVar.f862d;
                        Sc.s.b(obj2);
                        r62 = p06;
                        r11 = obj4;
                        ?? r122 = f860f.get(n02);
                        if (b02 != null && !b02.isActive()) {
                            throw b02.Z();
                        }
                        t2 = r122 == Be.z.f3696a ? null : r122;
                        aVar.f862d = n02;
                        aVar.f863e = interfaceC2397i2;
                        aVar.f864f = r62;
                        aVar.f865g = b02;
                        aVar.f866h = r122;
                        aVar.f869k = 2;
                        if (interfaceC2397i2.emit(t2, aVar) == aVar2) {
                            return aVar2;
                        }
                        obj = r122;
                        p03 = r62;
                        e11 = p03.e();
                        r62 = p03;
                        r11 = obj;
                        if (!e11) {
                            aVar.f862d = n02;
                            aVar.f863e = interfaceC2397i2;
                            aVar.f864f = p03;
                            aVar.f865g = b02;
                            aVar.f866h = obj;
                            aVar.f869k = 3;
                            Object c11 = p03.c(aVar);
                            r62 = p03;
                            r11 = obj;
                        }
                        ?? r1222 = f860f.get(n02);
                        if (b02 != null) {
                            throw b02.Z();
                        }
                        if (r1222 == Be.z.f3696a) {
                        }
                        aVar.f862d = n02;
                        aVar.f863e = interfaceC2397i2;
                        aVar.f864f = r62;
                        aVar.f865g = b02;
                        aVar.f866h = r1222;
                        aVar.f869k = 2;
                        if (interfaceC2397i2.emit(t2, aVar) == aVar2) {
                        }
                    }
                    interfaceC2397i2 = interfaceC2397i;
                    b02 = (xe.B0) aVar.getContext().get(xe.B0.f105374o0);
                    r11 = 0;
                    r62 = p02;
                    ?? r12222 = f860f.get(n02);
                    if (b02 != null) {
                    }
                    if (r12222 == Be.z.f3696a) {
                    }
                    aVar.f862d = n02;
                    aVar.f863e = interfaceC2397i2;
                    aVar.f864f = r62;
                    aVar.f865g = b02;
                    aVar.f866h = r12222;
                    aVar.f869k = 2;
                    if (interfaceC2397i2.emit(t2, aVar) == aVar2) {
                    }
                }
            }
            if (i11 != 0) {
            }
            interfaceC2397i2 = interfaceC2397i;
            b02 = (xe.B0) aVar.getContext().get(xe.B0.f105374o0);
            r11 = 0;
            r62 = p02;
            ?? r122222 = f860f.get(n02);
            if (b02 != null) {
            }
            if (r122222 == Be.z.f3696a) {
            }
            aVar.f862d = n02;
            aVar.f863e = interfaceC2397i2;
            aVar.f864f = r62;
            aVar.f865g = b02;
            aVar.f866h = r122222;
            aVar.f869k = 2;
            if (interfaceC2397i2.emit(t2, aVar) == aVar2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        aVar = new a(this, dVar);
        Object obj22 = aVar.f867i;
        aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f869k;
        ?? r622 = 1;
    }

    @Override // Ae.w0, Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        setValue(t2);
        return Unit.f71690a;
    }

    @Override // Be.AbstractC2630b
    public final P0 f() {
        return new P0();
    }

    @Override // Be.AbstractC2630b
    public final AbstractC2632d[] g() {
        return new P0[2];
    }

    @Override // Ae.B0
    @NotNull
    public final List<T> getReplayCache() {
        return C7714v.a0(getValue());
    }

    @Override // Ae.x0, Ae.M0
    public final T getValue() {
        C2857A c2857a = Be.z.f3696a;
        T t2 = (T) f860f.get(this);
        if (t2 == c2857a) {
            return null;
        }
        return t2;
    }

    @Override // Ae.w0
    public final void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Ae.x0
    public final void setValue(T t2) {
        if (t2 == null) {
            t2 = (T) Be.z.f3696a;
        }
        k(null, t2);
    }

    @Override // Ae.w0
    public final boolean tryEmit(T t2) {
        setValue(t2);
        return true;
    }
}
