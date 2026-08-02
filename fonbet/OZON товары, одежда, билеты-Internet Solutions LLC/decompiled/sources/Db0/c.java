package Db0;

import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.sso2.t;
import ru.ozon.id.nativeauth.sso2.v;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.common.ActivityLifecycleCallback$onFirstActivityLaunch$2", f = "ActivityLifecycleCallback.kt", l = {75, 76}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6299d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f6300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f6300e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f6300e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r7.h(false, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (xe.Y.b(5000, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6299d;
        f fVar = this.f6300e;
        if (i11 == 0) {
            s.b(obj);
            this.f6299d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                interfaceC4008j2 = fVar.f6309e;
                ((v) interfaceC4008j2.getValue()).k(t.b.f97470a);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        interfaceC4008j = fVar.f6308d;
        hd0.e eVar = (hd0.e) interfaceC4008j.getValue();
        this.f6299d = 2;
    }
}
