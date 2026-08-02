package Zc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Yc0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import jc0.AbstractC7343f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t implements InterfaceC2395h<Yc0.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f35884a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.C0648a f35885b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f35886a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel$special$$inlined$map$1$2", f = "PageAgreementWithConditionsViewModel.kt", l = {223}, m = "emit")
        /* renamed from: Zc0.t$a$a, reason: collision with other inner class name */
        public static final class C0678a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35887d;

            /* renamed from: e, reason: collision with root package name */
            int f35888e;

            public C0678a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f35887d = obj;
                this.f35888e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, a.C0648a c0648a) {
            this.f35886a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0678a c0678a;
            int i11;
            Yc0.a aVar;
            if (dVar instanceof C0678a) {
                c0678a = (C0678a) dVar;
                int i12 = c0678a.f35888e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0678a.f35888e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0678a.f35887d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0678a.f35888e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        AbstractC7343f event = (AbstractC7343f) obj;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof AbstractC7343f.b) {
                            AbstractC7343f.b bVar = (AbstractC7343f.b) event;
                            aVar = new a.b(bVar.b(), bVar.c(), bVar.a());
                        } else {
                            if (!(event instanceof AbstractC7343f.a)) {
                                throw new Sc.o();
                            }
                            aVar = a.c.f34898b;
                        }
                        c0678a.f35888e = 1;
                        if (this.f35886a.emit(aVar, c0678a) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0678a = new C0678a(dVar);
            Object obj22 = c0678a.f35887d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0678a.f35888e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public t(InterfaceC2395h interfaceC2395h, a.C0648a c0648a) {
        this.f35884a = interfaceC2395h;
        this.f35885b = c0648a;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Yc0.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f35884a.collect(new a(interfaceC2397i, this.f35885b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
