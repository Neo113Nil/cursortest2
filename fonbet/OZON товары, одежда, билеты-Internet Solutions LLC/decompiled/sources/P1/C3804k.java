package P1;

import P1.Z;
import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.E0;
import xe.f1;
import xe.l1;

/* renamed from: P1.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3804k implements A1<Object> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC3808o> f21567a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W f21568b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3805l f21569c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Z.b, Unit> f21570d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3796c f21571e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f21572f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21573g;

    /* JADX WARN: Multi-variable type inference failed */
    public C3804k(@NotNull List<? extends InterfaceC3808o> list, @NotNull Object obj, @NotNull W w11, @NotNull C3805l c3805l, @NotNull Function1<? super Z.b, Unit> function1, @NotNull C3796c c3796c) {
        C3991w0 f7;
        this.f21567a = list;
        this.f21568b = w11;
        this.f21569c = c3805l;
        this.f21570d = function1;
        this.f21571e = c3796c;
        f7 = n1.f(obj, D1.f25195a);
        this.f21572f = f7;
        this.f21573g = true;
    }

    @Override // S0.A1
    @NotNull
    public final Object getValue() {
        return this.f21572f.getValue();
    }

    public final boolean k() {
        return this.f21573g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0036, B:16:0x006c, B:18:0x0078), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:22:0x00a0, B:24:0x00b4, B:33:0x00d2, B:45:0x0052), top: B:44:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:22:0x00a0, B:24:0x00b4, B:33:0x00d2, B:45:0x0052), top: B:44:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:14:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e8 -> B:13:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C3800g c3800g;
        int i11;
        C3804k c3804k;
        List<InterfaceC3808o> list;
        int size;
        int i12;
        C3804k c3804k2;
        InterfaceC3808o interfaceC3808o;
        List<InterfaceC3808o> list2;
        if (cVar instanceof C3800g) {
            c3800g = (C3800g) cVar;
            int i13 = c3800g.f21556k;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3800g.f21556k = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3800g.f21554i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3800g.f21556k;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        list = this.f21567a;
                        size = list.size();
                        c3804k = this;
                        i12 = 0;
                        if (i12 < size) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c3804k = this;
                        boolean i14 = E0.i(c3800g.getContext());
                        c3804k.f21573g = false;
                        c3804k.f21570d.invoke(new Z.b(c3804k.f21572f.getValue(), i14));
                        throw th;
                    }
                } else if (i11 == 1) {
                    size = c3800g.f21553h;
                    i12 = c3800g.f21552g;
                    InterfaceC3808o interfaceC3808o2 = c3800g.f21551f;
                    List<InterfaceC3808o> list3 = c3800g.f21550e;
                    c3804k2 = c3800g.f21549d;
                    try {
                        Sc.s.b(obj);
                        interfaceC3808o = interfaceC3808o2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c3804k = c3804k2;
                        boolean i142 = E0.i(c3800g.getContext());
                        c3804k.f21573g = false;
                        c3804k.f21570d.invoke(new Z.b(c3804k.f21572f.getValue(), i142));
                        throw th;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = c3800g.f21553h;
                    i12 = c3800g.f21552g;
                    list2 = c3800g.f21550e;
                    c3804k = c3800g.f21549d;
                    try {
                        Sc.s.b(obj);
                        list = list2;
                        i12++;
                        if (i12 < size) {
                            InterfaceC3808o interfaceC3808o3 = list.get(i12);
                            if (interfaceC3808o3.a() == 2) {
                                C3805l c3805l = c3804k.f21569c;
                                C3796c c3796c = c3804k.f21571e;
                                C3801h c3801h = new C3801h(c3804k, interfaceC3808o3, null);
                                c3800g.f21549d = c3804k;
                                c3800g.f21550e = list;
                                c3800g.f21551f = interfaceC3808o3;
                                c3800g.f21552g = i12;
                                c3800g.f21553h = size;
                                c3800g.f21556k = 1;
                                Object f7 = c3805l.f(interfaceC3808o3, c3796c, c3801h, c3800g);
                                if (f7 != aVar) {
                                    list2 = list;
                                    obj = f7;
                                    c3804k2 = c3804k;
                                    interfaceC3808o = interfaceC3808o3;
                                    if (obj == null) {
                                        W w11 = c3804k2.f21568b;
                                        Object a11 = C.a(w11.d(), obj, interfaceC3808o, w11.e(), w11.c());
                                        C3991w0 c3991w0 = c3804k2.f21572f;
                                        c3991w0.setValue(a11);
                                        Unit unit = Unit.f71690a;
                                        boolean i15 = E0.i(c3800g.getContext());
                                        c3804k2.f21573g = false;
                                        c3804k2.f21570d.invoke(new Z.b(c3991w0.getValue(), i15));
                                        return unit;
                                    }
                                    c3800g.f21549d = c3804k2;
                                    c3800g.f21550e = list2;
                                    c3800g.f21551f = null;
                                    c3800g.f21552g = i12;
                                    c3800g.f21553h = size;
                                    c3800g.f21556k = 2;
                                    if (l1.a(c3800g) != aVar) {
                                        c3804k = c3804k2;
                                        list = list2;
                                    }
                                }
                                return aVar;
                            }
                            i12++;
                            if (i12 < size) {
                                boolean i16 = E0.i(c3800g.getContext());
                                c3804k.f21573g = false;
                                c3804k.f21570d.invoke(new Z.b(c3804k.f21572f.getValue(), i16));
                                return Unit.f71690a;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        boolean i1422 = E0.i(c3800g.getContext());
                        c3804k.f21573g = false;
                        c3804k.f21570d.invoke(new Z.b(c3804k.f21572f.getValue(), i1422));
                        throw th;
                    }
                }
            }
        }
        c3800g = new C3800g(this, cVar);
        Object obj2 = c3800g.f21554i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3800g.f21556k;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(@NotNull InterfaceC3808o interfaceC3808o, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C3802i c3802i;
        int i11;
        try {
            if (cVar instanceof C3802i) {
                c3802i = (C3802i) cVar;
                int i12 = c3802i.f21563g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3802i.f21563g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3802i.f21561e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3802i.f21563g;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3808o interfaceC3808o2 = c3802i.f21560d;
                        Sc.s.b(obj);
                        return obj;
                    }
                    Sc.s.b(obj);
                    C3803j c3803j = new C3803j(this, interfaceC3808o, null);
                    c3802i.f21560d = interfaceC3808o;
                    c3802i.f21563g = 1;
                    Object c11 = f1.c(15000L, c3803j, c3802i);
                    return c11 == aVar ? aVar : c11;
                }
            }
            if (i11 == 0) {
            }
        } catch (CancellationException e11) {
            if (!E0.i(c3802i.getContext())) {
                throw e11;
            }
            return null;
        } catch (Exception e12) {
            xe.J j11 = (xe.J) c3802i.getContext().get(xe.J.f105405n0);
            if (j11 != null) {
                j11.handleException(c3802i.getContext(), new IllegalStateException("Unable to load font " + interfaceC3808o, e12));
            }
            return null;
        }
        c3802i = new C3802i(this, cVar);
        Object obj2 = c3802i.f21561e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3802i.f21563g;
    }
}
