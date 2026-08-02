package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kotlin.Unit;

/* renamed from: Ae.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2401k implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable f1018a;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {111}, m = "collect")
    /* renamed from: Ae.k$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1019d;

        /* renamed from: e, reason: collision with root package name */
        int f1020e;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC2397i f1022g;

        /* renamed from: h, reason: collision with root package name */
        Iterator f1023h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1019d = obj;
            this.f1020e |= LinearLayoutManager.INVALID_OFFSET;
            return C2401k.this.collect(null, this);
        }
    }

    public C2401k(Iterable iterable) {
        this.f1018a = iterable;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        InterfaceC2397i interfaceC2397i2;
        Iterator it;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f1020e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f1020e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f1019d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f1020e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    interfaceC2397i2 = interfaceC2397i;
                    it = this.f1018a.iterator();
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = aVar.f1023h;
                    InterfaceC2397i interfaceC2397i3 = aVar.f1022g;
                    Sc.s.b(obj);
                    interfaceC2397i2 = interfaceC2397i3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    aVar.f1022g = interfaceC2397i2;
                    aVar.f1023h = it;
                    aVar.f1020e = 1;
                    if (interfaceC2397i2.emit(next, aVar) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f1019d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1020e;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }
}
