package Og0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements InterfaceC2395h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f20381a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f20382a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.data.repository.DialogStateRepositoryImpl$special$$inlined$map$1$2", f = "DialogStateRepositoryImpl.kt", l = {223}, m = "emit")
        /* renamed from: Og0.e$a$a, reason: collision with other inner class name */
        public static final class C0415a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f20383d;

            /* renamed from: e, reason: collision with root package name */
            int f20384e;

            public C0415a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f20383d = obj;
                this.f20384e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f20382a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0415a c0415a;
            int i11;
            f.a<T> aVar;
            if (dVar instanceof C0415a) {
                c0415a = (C0415a) dVar;
                int i12 = c0415a.f20384e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0415a.f20384e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0415a.f20383d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0415a.f20384e;
                    if (i11 != 0) {
                        s.b(obj2);
                        aVar = Og0.a.f20372c;
                        Boolean bool = (Boolean) ((W2.f) obj).c(aVar);
                        Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        c0415a.f20384e = 1;
                        if (this.f20382a.emit(valueOf, c0415a) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0415a = new C0415a(dVar);
            Object obj22 = c0415a.f20383d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0415a.f20384e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public e(InterfaceC2395h interfaceC2395h) {
        this.f20381a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Boolean> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f20381a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
