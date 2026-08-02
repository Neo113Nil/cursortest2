package Xc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Xc0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import jc0.AbstractC7343f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k implements InterfaceC2395h<Xc0.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f34365a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f34366a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$special$$inlined$map$1$2", f = "OtpViewModel.kt", l = {223}, m = "emit")
        /* renamed from: Xc0.k$a$a, reason: collision with other inner class name */
        public static final class C0617a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f34367d;

            /* renamed from: e, reason: collision with root package name */
            int f34368e;

            public C0617a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f34367d = obj;
                this.f34368e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f34366a = interfaceC2397i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0617a c0617a;
            int i11;
            Object obj2;
            if (dVar instanceof C0617a) {
                c0617a = (C0617a) dVar;
                int i12 = c0617a.f34368e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0617a.f34368e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj3 = c0617a.f34367d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0617a.f34368e;
                    if (i11 != 0) {
                        s.b(obj3);
                        AbstractC7343f event = (AbstractC7343f) obj;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof AbstractC7343f.b) {
                            AbstractC7343f.b bVar = (AbstractC7343f.b) event;
                            obj2 = new a.c(bVar.b(), bVar.c(), bVar.a());
                        } else {
                            obj2 = a.d.f34284a;
                        }
                        c0617a.f34368e = 1;
                        if (this.f34366a.emit(obj2, c0617a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj3);
                    }
                    return Unit.f71690a;
                }
            }
            c0617a = new C0617a(dVar);
            Object obj32 = c0617a.f34367d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0617a.f34368e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public k(InterfaceC2395h interfaceC2395h) {
        this.f34365a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Xc0.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f34365a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
