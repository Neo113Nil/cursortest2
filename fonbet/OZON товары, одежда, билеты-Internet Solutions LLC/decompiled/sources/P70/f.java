package P70;

import A30.m;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.network.models.a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadViewModel$authorize$1", f = "PinPadViewModel.kt", l = {481}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    h f21944d;

    /* renamed from: e, reason: collision with root package name */
    int f21945e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f21946f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadViewModel$authorize$1$1", f = "PinPadViewModel.kt", l = {482}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super D30.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21947d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f21948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21948e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f21948e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super D30.a> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            String str;
            String str2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21947d;
            h hVar = this.f21948e;
            if (i11 == 0) {
                s.b(obj);
                mVar = hVar.f21954b;
                str = hVar.f21972t;
                str2 = hVar.f21974v;
                this.f21947d = 1;
                obj = mVar.e(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a.b bVar = a.b.f96629a;
            hVar.getClass();
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f21946f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f21946f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21945e;
        h hVar2 = this.f21946f;
        if (i11 == 0) {
            s.b(obj);
            a.c cVar = a.c.f96630a;
            hVar2.getClass();
            hVar2.handleState();
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            a aVar2 = new a(hVar2, null);
            this.f21944d = hVar2;
            this.f21945e = 1;
            obj = C10727i.f(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.f21944d;
            s.b(obj);
        }
        hVar.f21969q = (D30.a) obj;
        h.s0(hVar2);
        return Unit.f71690a;
    }
}
