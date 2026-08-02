package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;

/* renamed from: Ae.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2425z implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f1171b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    /* renamed from: Ae.z$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1172d;

        /* renamed from: e, reason: collision with root package name */
        int f1173e;

        /* renamed from: g, reason: collision with root package name */
        Object f1175g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f1176h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1172d = obj;
            this.f1173e |= LinearLayoutManager.INVALID_OFFSET;
            return C2425z.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2425z(InterfaceC2395h interfaceC2395h, InterfaceC6511n interfaceC6511n) {
        this.f1170a = interfaceC2395h;
        this.f1171b = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r9v6, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        Wc.a aVar2;
        int i11;
        C2425z c2425z;
        T0 t02;
        ?? r22;
        Be.B b11;
        Throwable th2;
        Be.B b12;
        ?? r92;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i12 = aVar.f1173e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f1173e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f1172d;
                    aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f1173e;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        try {
                            InterfaceC2395h interfaceC2395h = this.f1170a;
                            aVar.f1175g = this;
                            aVar.f1176h = interfaceC2397i;
                            aVar.f1173e = 1;
                            if (interfaceC2395h.collect(interfaceC2397i, aVar) != aVar2) {
                                c2425z = this;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c2425z = this;
                            t02 = new T0(th);
                            r22 = c2425z.f1171b;
                            aVar.f1175g = th;
                            aVar.f1176h = null;
                            aVar.f1173e = 2;
                            if (B.a(t02, r22, th, aVar) != aVar2) {
                                return aVar2;
                            }
                            throw th;
                        }
                        return aVar2;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Throwable th4 = (Throwable) aVar.f1175g;
                            Sc.s.b(obj);
                            throw th4;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b12 = (Be.B) aVar.f1175g;
                        try {
                            Sc.s.b(obj);
                            b12.releaseIntercepted();
                            return Unit.f71690a;
                        } catch (Throwable th5) {
                            th2 = th5;
                            b12.releaseIntercepted();
                            throw th2;
                        }
                    }
                    interfaceC2397i = aVar.f1176h;
                    c2425z = (C2425z) aVar.f1175g;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th6) {
                        th = th6;
                        t02 = new T0(th);
                        r22 = c2425z.f1171b;
                        aVar.f1175g = th;
                        aVar.f1176h = null;
                        aVar.f1173e = 2;
                        if (B.a(t02, r22, th, aVar) != aVar2) {
                        }
                    }
                    b11 = new Be.B(interfaceC2397i, aVar.getContext());
                    r92 = c2425z.f1171b;
                    aVar.f1175g = b11;
                    aVar.f1176h = null;
                    aVar.f1173e = 3;
                    if (r92.invoke(b11, null, aVar) != aVar2) {
                        b12 = b11;
                        b12.releaseIntercepted();
                        return Unit.f71690a;
                    }
                    return aVar2;
                }
            }
            r92 = c2425z.f1171b;
            aVar.f1175g = b11;
            aVar.f1176h = null;
            aVar.f1173e = 3;
            if (r92.invoke(b11, null, aVar) != aVar2) {
            }
            return aVar2;
        } catch (Throwable th7) {
            th2 = th7;
            b12 = b11;
            b12.releaseIntercepted();
            throw th2;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f1172d;
        aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1173e;
        if (i11 != 0) {
        }
        b11 = new Be.B(interfaceC2397i, aVar.getContext());
    }
}
