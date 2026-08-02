package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class N implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f854a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f855b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f856d;

        /* renamed from: e, reason: collision with root package name */
        int f857e;

        /* renamed from: g, reason: collision with root package name */
        Object f859g;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f856d = obj;
            this.f857e |= LinearLayoutManager.INVALID_OFFSET;
            return N.this.collect(null, this);
        }
    }

    public N(InterfaceC2395h interfaceC2395h, int i11) {
        this.f854a = interfaceC2395h;
        this.f855b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        C2629a e11;
        Object obj;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f857e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f857e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f856d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f857e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    Object obj3 = new Object();
                    kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
                    try {
                        InterfaceC2395h interfaceC2395h = this.f854a;
                        O o11 = new O(k11, this.f855b, interfaceC2397i, obj3);
                        aVar.f859g = obj3;
                        aVar.f857e = 1;
                        if (interfaceC2395h.collect(o11, aVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (C2629a e12) {
                        e11 = e12;
                        obj = obj3;
                        if (e11.f3566a != obj) {
                            throw e11;
                        }
                        return Unit.f71690a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = aVar.f859g;
                    try {
                        Sc.s.b(obj2);
                    } catch (C2629a e13) {
                        e11 = e13;
                        if (e11.f3566a != obj) {
                        }
                        return Unit.f71690a;
                    }
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f856d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f857e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
