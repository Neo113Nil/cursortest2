package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class C implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f762b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f763d;

        /* renamed from: e, reason: collision with root package name */
        int f764e;

        /* renamed from: g, reason: collision with root package name */
        C f766g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f767h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f763d = obj;
            this.f764e |= LinearLayoutManager.INVALID_OFFSET;
            return C.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(InterfaceC2395h interfaceC2395h, InterfaceC6511n interfaceC6511n) {
        this.f761a = interfaceC2395h;
        this.f762b = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r2.invoke(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v3, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        C c11;
        Throwable th2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f764e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f764e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f763d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f764e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f766g = this;
                    aVar.f767h = interfaceC2397i;
                    aVar.f764e = 1;
                    obj = H.a(this.f761a, interfaceC2397i, aVar);
                    if (obj != obj2) {
                        c11 = this;
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = aVar.f767h;
                c11 = aVar.f766g;
                Sc.s.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    ?? r22 = c11.f762b;
                    aVar.f766g = null;
                    aVar.f767h = null;
                    aVar.f764e = 2;
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj3 = aVar.f763d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f764e;
        if (i11 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return Unit.f71690a;
    }
}
