package Ae;

import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class S0<T> implements B0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B0<T> f910a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC2397i<? super T>, kotlin.coroutines.d<? super Unit>, Object> f911b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {408}, m = "collect")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f912d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S0<T> f913e;

        /* renamed from: f, reason: collision with root package name */
        int f914f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S0<T> s02, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f913e = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f912d = obj;
            this.f914f |= LinearLayoutManager.INVALID_OFFSET;
            return this.f913e.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S0(@NotNull B0<? extends T> b02, @NotNull Function2<? super InterfaceC2397i<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f910a = b02;
        this.f911b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f914f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f914f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f912d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f914f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    R0 r02 = new R0(interfaceC2397i, this.f911b);
                    aVar.f914f = 1;
                    if (this.f910a.collect(r02, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f912d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f914f;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
