package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ae.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2391f<T> implements InterfaceC2395h<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<T> f974a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, Object> f975b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function2<Object, Object, Boolean> f976c;

    /* renamed from: Ae.f$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2391f<T> f977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<T> f979c;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "emit")
        /* renamed from: Ae.f$a$a, reason: collision with other inner class name */
        static final class C0031a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f980d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<T> f981e;

            /* renamed from: f, reason: collision with root package name */
            int f982f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0031a(a<? super T> aVar, kotlin.coroutines.d<? super C0031a> dVar) {
                super(dVar);
                this.f981e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f980d = obj;
                this.f982f |= LinearLayoutManager.INVALID_OFFSET;
                return this.f981e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(C2391f<T> c2391f, kotlin.jvm.internal.M<Object> m11, InterfaceC2397i<? super T> interfaceC2397i) {
            this.f977a = c2391f;
            this.f978b = m11;
            this.f979c = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C0031a c0031a;
            int i11;
            if (dVar instanceof C0031a) {
                c0031a = (C0031a) dVar;
                int i12 = c0031a.f982f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0031a.f982f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0031a.f980d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0031a.f982f;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        C2391f<T> c2391f = this.f977a;
                        T t11 = (T) c2391f.f975b.invoke(t2);
                        kotlin.jvm.internal.M<Object> m11 = this.f978b;
                        Object obj2 = m11.f71787a;
                        if (obj2 != Be.z.f3696a && c2391f.f976c.invoke(obj2, t11).booleanValue()) {
                            return Unit.f71690a;
                        }
                        m11.f71787a = t11;
                        c0031a.f982f = 1;
                        if (this.f979c.emit(t2, c0031a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }
            c0031a = new C0031a(this, dVar);
            Object obj3 = c0031a.f980d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0031a.f982f;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2391f(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.f974a = interfaceC2395h;
        this.f975b = function1;
        this.f976c = function2;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        m11.f71787a = (T) Be.z.f3696a;
        Object collect = this.f974a.collect(new a(this, m11, interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
