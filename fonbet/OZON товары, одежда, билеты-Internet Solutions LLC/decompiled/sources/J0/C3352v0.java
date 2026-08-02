package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.C9140t;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", l = {519}, m = "invokeSuspend")
/* renamed from: J0.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3352v0 extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13433d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f13434e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13435f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", l = {522, 523}, m = "invokeSuspend")
    /* renamed from: J0.v0$a */
    static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f13436d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f13437e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f13438f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13438f = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f13438f, dVar);
            aVar.f13437e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        
            if (r0.C9115P.d(r1, r5, r4, 1) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC10628c interfaceC10628c;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f13436d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC10628c = (InterfaceC10628c) this.f13437e;
                EnumC10640o enumC10640o = EnumC10640o.Initial;
                this.f13437e = interfaceC10628c;
                this.f13436d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    if (((x1.x) obj) != null) {
                        this.f13438f.invoke();
                    }
                    return Unit.f71690a;
                }
                interfaceC10628c = (InterfaceC10628c) this.f13437e;
                Sc.s.b(obj);
            }
            EnumC10640o enumC10640o2 = EnumC10640o.Initial;
            this.f13437e = null;
            this.f13436d = 2;
            obj = C9115P.h(interfaceC10628c, enumC10640o2, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3352v0(Function0<Unit> function0, kotlin.coroutines.d<? super C3352v0> dVar) {
        super(2, dVar);
        this.f13435f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3352v0 c3352v0 = new C3352v0(this.f13435f, dVar);
        c3352v0.f13434e = obj;
        return c3352v0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3352v0) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13433d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f13434e;
            a aVar2 = new a(this.f13435f, null);
            this.f13433d = 1;
            if (C9140t.b(f7, aVar2, this) == aVar) {
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
