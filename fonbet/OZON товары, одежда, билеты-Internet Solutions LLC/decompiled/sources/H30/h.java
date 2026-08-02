package H30;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h[] f10555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fd.r f10556b;

    static final class a extends AbstractC7737t implements Function0<Object[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h[] f10557b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h[] interfaceC2395hArr) {
            super(0);
            this.f10557b = interfaceC2395hArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.f10557b.length];
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.base.extension.FlowExtKt$combine6$$inlined$combine$1$3", f = "FlowExt.kt", l = {333, 238}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f10558d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f10559e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object[] f10560f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ fd.r f10561g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, fd.r rVar) {
            super(3, dVar);
            this.f10561g = rVar;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(dVar, this.f10561g);
            bVar.f10559e = interfaceC2397i;
            bVar.f10560f = objArr;
            return bVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        
            if (r1.emit(r14, r13) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r14 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC2397i interfaceC2397i;
            b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f10558d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = this.f10559e;
                Object[] objArr = this.f10560f;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                Object obj7 = objArr[5];
                this.f10559e = interfaceC2397i;
                this.f10558d = 1;
                bVar = this;
                obj = this.f10561g.h(obj2, obj3, obj4, obj5, obj6, obj7, bVar);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = this.f10559e;
                Sc.s.b(obj);
                bVar = this;
            }
            bVar.f10559e = null;
            bVar.f10558d = 2;
        }
    }

    public h(InterfaceC2395h[] interfaceC2395hArr, fd.r rVar) {
        this.f10555a = interfaceC2395hArr;
        this.f10556b = rVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        InterfaceC2395h[] interfaceC2395hArr = this.f10555a;
        Object a11 = Be.p.a(interfaceC2397i, new b(null, this.f10556b), dVar, new a(interfaceC2395hArr), interfaceC2395hArr);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
