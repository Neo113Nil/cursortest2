package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class P implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f879a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f880b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f881d;

        /* renamed from: e, reason: collision with root package name */
        int f882e;

        /* renamed from: g, reason: collision with root package name */
        Q f884g;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f881d = obj;
            this.f882e |= LinearLayoutManager.INVALID_OFFSET;
            return P.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(InterfaceC2395h interfaceC2395h, Function2 function2) {
        this.f879a = interfaceC2395h;
        this.f880b = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        Q q11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f882e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f882e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f881d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f882e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC2395h interfaceC2395h = this.f879a;
                    Q q12 = new Q(interfaceC2397i, this.f880b);
                    try {
                        aVar.f884g = q12;
                        aVar.f882e = 1;
                        if (interfaceC2395h.collect(q12, aVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (C2629a e11) {
                        e = e11;
                        q11 = q12;
                        if (e.f3566a != q11) {
                        }
                        return Unit.f71690a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q11 = aVar.f884g;
                    try {
                        Sc.s.b(obj);
                    } catch (C2629a e12) {
                        e = e12;
                        if (e.f3566a != q11) {
                            throw e;
                        }
                        return Unit.f71690a;
                    }
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f881d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f882e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
