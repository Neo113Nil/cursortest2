package Qh0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.updater.PushTokenUpdatersStorage$init$2", f = "PushTokenUpdatersStorage.kt", l = {121, 61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f23444d;

    /* renamed from: e, reason: collision with root package name */
    int f23445e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f23446f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ j f23447g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.updater.PushTokenUpdatersStorage$init$2$2", f = "PushTokenUpdatersStorage.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f23448d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f23448d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f23448d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            j jVar = this.f23448d;
            m.a(jVar.f23465a, jVar.f23466b, jVar.f23467c);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(h hVar, j jVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f23446f = hVar;
        this.f23447g = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f23446f, this.f23447g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (xe.C10727i.f(r1, r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r1.a(r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23445e;
        try {
            if (i11 == 0) {
                s.b(obj);
                dVar = this.f23446f.f23460g;
                this.f23444d = dVar;
                this.f23445e = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                dVar = this.f23444d;
                s.b(obj);
            }
            Unit unit = Unit.f71690a;
            dVar.c(null);
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            a aVar2 = new a(this.f23447g, null);
            this.f23444d = null;
            this.f23445e = 2;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
    }
}
