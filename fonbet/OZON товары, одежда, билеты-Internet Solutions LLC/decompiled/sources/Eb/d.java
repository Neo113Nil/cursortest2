package Eb;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f7784a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f.a f7785b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f7786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f7787b;

        @kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {223}, m = "emit")
        /* renamed from: Eb.d$a$a, reason: collision with other inner class name */
        public static final class C0175a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f7788d;

            /* renamed from: e, reason: collision with root package name */
            int f7789e;

            public C0175a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f7788d = obj;
                this.f7789e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, f.a aVar) {
            this.f7786a = interfaceC2397i;
            this.f7787b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0175a c0175a;
            int i11;
            if (dVar instanceof C0175a) {
                c0175a = (C0175a) dVar;
                int i12 = c0175a.f7789e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0175a.f7789e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0175a.f7788d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0175a.f7789e;
                    if (i11 != 0) {
                        s.b(obj2);
                        Object c11 = ((W2.f) obj).c(this.f7787b);
                        c0175a.f7789e = 1;
                        if (this.f7786a.emit(c11, c0175a) == aVar) {
                            return aVar;
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
            c0175a = new C0175a(dVar);
            Object obj22 = c0175a.f7788d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0175a.f7789e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public d(InterfaceC2395h interfaceC2395h, f.a aVar) {
        this.f7784a = interfaceC2395h;
        this.f7785b = aVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f7784a.collect(new a(interfaceC2397i, this.f7785b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
